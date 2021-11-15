package Models.Users;

import java.util.Arrays;

/**
 * CREATED BY mathias @ 13-11-2021 - 21:41
 **/
public class Permissions {
    protected enum UserPermissions {
        //NOTE THIS PERMISSIONS ARE MEANT FOR WEBSITE BASED CHANGES NOT DATABASE CHECK InternalPermissions.Class
        CREATE_PRODUCT,
        DELETE_PRODUCT,
        ADD_PRODUCT,
        UPLOAD_PROFILE_PICTURE,
        DELETE_USER,
        MODIFY_USER,
        ADD_TO_BASKET,
        VIEW_ADMIN_PAGE,
        VIEW_PERSONAL_USER_PAGE

    };


}

