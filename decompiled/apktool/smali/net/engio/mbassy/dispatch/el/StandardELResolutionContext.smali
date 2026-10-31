.class public Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;
.super Ljavax/el/ELContext;
.source "StandardELResolutionContext.java"


# instance fields
.field public final functionMapper:Ljavax/el/FunctionMapper;

.field public final message:Ljava/lang/Object;

.field public final resolver:Ljavax/el/ELResolver;

.field public final variableMapper:Ljavax/el/VariableMapper;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljavax/el/ELContext;-><init>()V

    .line 27
    iput-object p1, p0, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;->message:Ljava/lang/Object;

    .line 28
    new-instance p1, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$NoopFunctionMapper;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$NoopFunctionMapper;-><init>(Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$1;)V

    iput-object p1, p0, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;->functionMapper:Ljavax/el/FunctionMapper;

    .line 29
    new-instance p1, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$MsgMapper;

    invoke-direct {p1, p0, v0}, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$MsgMapper;-><init>(Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$1;)V

    iput-object p1, p0, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;->variableMapper:Ljavax/el/VariableMapper;

    .line 32
    new-instance p1, Ljavax/el/BeanELResolver;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljavax/el/BeanELResolver;-><init>(Z)V

    iput-object p1, p0, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;->resolver:Ljavax/el/ELResolver;

    return-void
.end method

.method public static synthetic access$200(Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;)Ljava/lang/Object;
    .locals 0

    .line 17
    iget-object p0, p0, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;->message:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public getELResolver()Ljavax/el/ELResolver;
    .locals 1

    .line 43
    iget-object v0, p0, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;->resolver:Ljavax/el/ELResolver;

    return-object v0
.end method

.method public getFunctionMapper()Ljavax/el/FunctionMapper;
    .locals 1

    .line 51
    iget-object v0, p0, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;->functionMapper:Ljavax/el/FunctionMapper;

    return-object v0
.end method

.method public getVariableMapper()Ljavax/el/VariableMapper;
    .locals 1

    .line 59
    iget-object v0, p0, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;->variableMapper:Ljavax/el/VariableMapper;

    return-object v0
.end method
