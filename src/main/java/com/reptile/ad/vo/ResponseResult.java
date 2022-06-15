package com.reptile.ad.vo;

import java.io.Serializable;

/**
 * TODO
 *
 * @author mzs
 * @version 1.0
 * @date 2021/1/16 13:54
 */
public class ResponseResult implements Serializable {
    private Integer code;
    private String msg;
    private Object data;

    public ResponseResult(Object data) {
        this.code = 1000;
        this.msg = "success";
        this.data = data;
    }
    public ResponseResult(Integer code) {
        this.code = code;
        this.msg = "";
        this.data = "";
    }

    public ResponseResult() {
        this.code = 1000;
        this.msg = "success";
        this.data = data;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ResponseResult)) {
            return false;
        } else {
            ResponseResult other = (ResponseResult)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$code = this.getCode();
                    Object other$code = other.getCode();
                    if (this$code == null) {
                        if (other$code == null) {
                            break label47;
                        }
                    } else if (this$code.equals(other$code)) {
                        break label47;
                    }

                    return false;
                }

                Object this$msg = this.getMsg();
                Object other$msg = other.getMsg();
                if (this$msg == null) {
                    if (other$msg != null) {
                        return false;
                    }
                } else if (!this$msg.equals(other$msg)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ResponseResult;
    }

//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        Object $code = this.getCode();
//        int result = result * 59 + ($code == null ? 43 : $code.hashCode());
//        Object $msg = this.getMsg();
//        result = result * 59 + ($msg == null ? 43 : $msg.hashCode());
//        Object $data = this.getData();
//        result = result * 59 + ($data == null ? 43 : $data.hashCode());
//        return result;
//    }

    public String toString() {
        return "ResponseResult(code=" + this.getCode() + ", msg=" + this.getMsg() + ", data=" + this.getData() + ")";
    }

    public ResponseResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}

