.class public Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$MsgMapper;
.super Ljavax/el/VariableMapper;
.source "StandardELResolutionContext.java"


# static fields
.field public static final msg:Ljava/lang/String; = "msg"


# instance fields
.field public final msgExpression:Ljavax/el/ValueExpression;

.field public final synthetic this$0:Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;)V
    .locals 2

    .line 66
    iput-object p1, p0, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$MsgMapper;->this$0:Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;

    invoke-direct {p0}, Ljavax/el/VariableMapper;-><init>()V

    .line 69
    invoke-static {}, Lnet/engio/mbassy/dispatch/el/ElFilter;->ELFactory()Ljavax/el/ExpressionFactory;

    move-result-object v0

    invoke-static {p1}, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;->access$200(Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1}, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;->access$200(Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljavax/el/ExpressionFactory;->createValueExpression(Ljava/lang/Object;Ljava/lang/Class;)Ljavax/el/ValueExpression;

    move-result-object p1

    iput-object p1, p0, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$MsgMapper;->msgExpression:Ljavax/el/ValueExpression;

    return-void
.end method

.method public synthetic constructor <init>(Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$1;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$MsgMapper;-><init>(Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;)V

    return-void
.end method


# virtual methods
.method public resolveVariable(Ljava/lang/String;)Ljavax/el/ValueExpression;
    .locals 1

    const-string v0, "msg"

    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p0, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$MsgMapper;->msgExpression:Ljavax/el/ValueExpression;

    return-object p1
.end method

.method public setVariable(Ljava/lang/String;Ljavax/el/ValueExpression;)Ljavax/el/ValueExpression;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
