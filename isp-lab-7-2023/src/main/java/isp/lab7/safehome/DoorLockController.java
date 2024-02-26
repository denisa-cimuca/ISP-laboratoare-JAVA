package isp.lab7.safehome;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoorLockController {

        private Map<Tenant, AccessKey> validAccess;

        public DoorLockController ( Map<Tenant, AccessKey> validAccess ) {
            this.validAccess = validAccess;
        }

        @Override
        public DoorStatus enterPin ( String pin ) throws Exception {
            if ( !pin.equals ( pin ) ) {
                throw new InvalidPinException ( "Invalid PIN entered" );
            }
            return null;
        }

        @Override
        public void addTenant ( String pin , String name ) throws Exception {
            if(name == null || name.trim ().isEmpty ()){
                throw new EmptyTenantNameaException("Numele este null");
            }

            Tenant tenant = new Tenant ( name );
            AccessKey accessKey = new AccessKey ( pin );
            if (validAccess.containsKey ( tenant )) {
                throw new TenantAlreadyExistsException ( "Tenant already exists: " + name );
            }
            else {
                validAccess.put(tenant,accessKey);
            }
        }

        @Override
        public void removeTenant ( String name ) throws Exception {
            if(name==null) {
                throw new TenantNotFoundException ( "Tenant " + name + "not found" );
            }
            validAccess.remove(name);
        }

        @Override
        public List<AccessLog> getAccessLogs ( ) {
            return null;
        }
// { return new ArrayList<>(this.accesLogs);
//}
//    private void logAccess(){
//        this.accesLogs.add(new AccesLog ( "andrei", 'may', "open"));
//    }

}
