package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
public class Caller {
    public final Function commit;
    public final Function complete;
    public final Context context;
    public final Function persist;
    public final Function replace;
    public final Function resolve;
    public final Function validate;

    public Caller(Scanner scanner, Context context) {
        this.validate = scanner.getValidate();
        this.complete = scanner.getComplete();
        this.replace = scanner.getReplace();
        this.resolve = scanner.getResolve();
        this.persist = scanner.getPersist();
        this.commit = scanner.getCommit();
        this.context = context;
    }

    public Object replace(Object obj) {
        Function function = this.replace;
        return function != null ? function.call(this.context, obj) : obj;
    }

    public Object resolve(Object obj) {
        Function function = this.resolve;
        return function != null ? function.call(this.context, obj) : obj;
    }

    public void commit(Object obj) {
        Function function = this.commit;
        if (function != null) {
            function.call(this.context, obj);
        }
    }

    public void validate(Object obj) {
        Function function = this.validate;
        if (function != null) {
            function.call(this.context, obj);
        }
    }

    public void persist(Object obj) {
        Function function = this.persist;
        if (function != null) {
            function.call(this.context, obj);
        }
    }

    public void complete(Object obj) {
        Function function = this.complete;
        if (function != null) {
            function.call(this.context, obj);
        }
    }
}
