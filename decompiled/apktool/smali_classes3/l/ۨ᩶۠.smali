.class public final Ll/ۨ᩶۠;
.super Ljava/lang/Object;
.source "79RF"


# instance fields
.field public final ֫:Landroid/content/ComponentName;

.field public ۧ:Ljava/lang/String;

.field public ܽ:I


# direct methods
.method public constructor <init>(Landroid/content/ComponentName;)V
    .locals 1

    .line 589
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 582
    iput v0, p0, Ll/ۨ᩶۠;->ܽ:I

    .line 590
    iput-object p1, p0, Ll/ۨ᩶۠;->֫:Landroid/content/ComponentName;

    return-void
.end method

.method public static ֫(Ll/ۨ᩶۠;)Landroid/os/Bundle;
    .locals 4

    .line 579
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "shizuku:user-service-arg-component"

    .line 668
    iget-object v2, p0, Ll/ۨ᩶۠;->֫:Landroid/content/ComponentName;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "shizuku:user-service-arg-debuggable"

    const/4 v2, 0x0

    .line 669
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "shizuku:user-service-arg-version-code"

    .line 670
    iget v3, p0, Ll/ۨ᩶۠;->ܽ:I

    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "shizuku:user-service-arg-daemon"

    const/4 v3, 0x1

    .line 671
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "shizuku:user-service-arg-use-32-bit-app-process"

    .line 672
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 673
    iget-object p0, p0, Ll/ۨ᩶۠;->ۧ:Ljava/lang/String;

    const-string v1, "process name suffix must not be null"

    .line 674
    invoke-static {p0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v1, "shizuku:user-service-arg-process-name"

    .line 673
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const-string v0, "cmd"

    .line 647
    iput-object v0, p0, Ll/ۨ᩶۠;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const v0, 0x18e4545

    .line 626
    iput v0, p0, Ll/ۨ᩶۠;->ܽ:I

    return-void
.end method
