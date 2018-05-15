package com.czj.controller.base;

/**
 * @Description:
 */
public class ServiceResponseHandle {
    public static ServiceResponse failed(String could_not_read_json) {
        ServiceResponse rp = new ServiceResponse();
        rp.SetMsg(could_not_read_json);
        return rp;
    }
}
