.class public Ll/᩹ܺᩳ;
.super Landroid/app/Service;
.source "57CG"


# instance fields
.field public final ᩸:Ll/֡ܺᩳ;

.field public ᩹:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 23
    new-instance v0, Ll/᩸ܺᩳ;

    invoke-direct {v0, p0}, Ll/᩸ܺᩳ;-><init>(Ll/᩹ܺᩳ;)V

    iput-object v0, p0, Ll/᩹ܺᩳ;->᩸:Ll/֡ܺᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹ܺᩳ;)Ljava/lang/Throwable;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ܺᩳ;->᩹:Ljava/lang/Throwable;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/᩹ܺᩳ;Ljava/lang/Throwable;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩹ܺᩳ;->᩹:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 20
    iget-object p1, p0, Ll/᩹ܺᩳ;->᩸:Ll/֡ܺᩳ;

    return-object p1
.end method
