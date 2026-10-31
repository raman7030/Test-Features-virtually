.class public Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$NoopFunctionMapper;
.super Ljavax/el/FunctionMapper;
.source "StandardELResolutionContext.java"


# instance fields
.field public final synthetic this$0:Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$NoopFunctionMapper;->this$0:Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;

    invoke-direct {p0}, Ljavax/el/FunctionMapper;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$1;)V
    .locals 0

    .line 88
    invoke-direct {p0, p1}, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext$NoopFunctionMapper;-><init>(Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;)V

    return-void
.end method


# virtual methods
.method public resolveFunction(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
