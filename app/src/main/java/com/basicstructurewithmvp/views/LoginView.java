package com.basicstructurewithmvp.views;

import com.basicstructurewithmvp.baseclasses.BaseView;
import com.basicstructurewithmvp.models.LoginResponse;
import com.basicstructurewithmvp.models.Response;

/**
 * Created by Paresh
 */

public interface LoginView extends BaseView {

    void onSuccess(LoginResponse response);

    void onFailure(String message);
}
