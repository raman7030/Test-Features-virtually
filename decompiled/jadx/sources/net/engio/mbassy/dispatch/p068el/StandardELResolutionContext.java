package net.engio.mbassy.dispatch.p068el;

import java.lang.reflect.Method;
import javax.el.BeanELResolver;
import javax.el.ELContext;
import javax.el.ELResolver;
import javax.el.FunctionMapper;
import javax.el.ValueExpression;
import javax.el.VariableMapper;

/* JADX INFO: loaded from: classes.dex */
public class StandardELResolutionContext extends ELContext {
    public final FunctionMapper functionMapper;
    public final Object message;
    public final ELResolver resolver = new BeanELResolver(true);
    public final VariableMapper variableMapper;

    public StandardELResolutionContext(Object obj) {
        this.message = obj;
        this.functionMapper = new NoopFunctionMapper();
        this.variableMapper = new MsgMapper();
    }

    public ELResolver getELResolver() {
        return this.resolver;
    }

    public FunctionMapper getFunctionMapper() {
        return this.functionMapper;
    }

    public VariableMapper getVariableMapper() {
        return this.variableMapper;
    }

    public class MsgMapper extends VariableMapper {
        public static final String msg = "msg";
        public final ValueExpression msgExpression;

        public ValueExpression setVariable(String str, ValueExpression valueExpression) {
            return null;
        }

        public MsgMapper() {
            this.msgExpression = ElFilter.ELFactory().createValueExpression(StandardELResolutionContext.this.message, StandardELResolutionContext.this.message.getClass());
        }

        public ValueExpression resolveVariable(String str) {
            if (str.equals("msg")) {
                return this.msgExpression;
            }
            return null;
        }
    }

    public class NoopFunctionMapper extends FunctionMapper {
        public Method resolveFunction(String str, String str2) {
            return null;
        }

        public NoopFunctionMapper() {
        }
    }
}
