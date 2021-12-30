/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 15:43 2021/3/22
 * @Modifued By:
 */
public enum Elvis {
    INSTANCE((byte)1);

    private byte status;

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public byte getTest() {
        return test;
    }

    public void setTest(byte test) {
        this.test = test;
    }

    private byte test;

    Elvis(byte status) {
        this.status = status;
    }
}