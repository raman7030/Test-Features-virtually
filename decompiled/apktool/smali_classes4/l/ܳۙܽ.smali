.class public final Ll/ܳۙܽ;
.super Ljava/lang/Object;
.source "28VT"

# interfaces
.implements Ll/᩷ۨܽ;


# instance fields
.field public final synthetic ֫:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    .line 622
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۙܽ;->֫:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 1

    const/4 v0, 0x0

    .line 637
    sput-boolean v0, Ll/᩹ܿᩳ;->᩻:Z

    return-void
.end method

.method public final onSuccess()V
    .locals 1

    const/4 v0, 0x0

    .line 625
    sput-boolean v0, Ll/᩹ܿᩳ;->᩻:Z

    .line 626
    iget-object v0, p0, Ll/ܳۙܽ;->֫:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)Z
    .locals 0

    const/4 p1, 0x0

    .line 631
    sput-boolean p1, Ll/᩹ܿᩳ;->᩻:Z

    return p1
.end method
