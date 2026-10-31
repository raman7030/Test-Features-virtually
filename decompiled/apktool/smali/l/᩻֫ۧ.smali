.class public final Ll/᩻֫ۧ;
.super Landroid/app/job/JobService;
.source "T8R3"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 139
    invoke-direct {p0}, Landroid/app/job/JobService;-><init>()V

    return-void
.end method


# virtual methods
.method public final onStartJob(Landroid/app/job/JobParameters;)Z
    .locals 3

    .line 142
    invoke-virtual {p1}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;

    move-result-object v0

    .line 143
    new-instance v1, Ll/᩷֫ۧ;

    const-string v2, "requirements"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v1, v2}, Ll/᩷֫ۧ;-><init>(I)V

    .line 144
    invoke-virtual {v1, p0}, Ll/᩷֫ۧ;->֫(Ll/᩻֫ۧ;)I

    move-result v1

    if-nez v1, :cond_0

    const-string p1, "service_action"

    .line 146
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "service_package"

    .line 147
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    .line 149
    invoke-static {p0, p1}, Ll/ۘ֨֫;->֫(Ll/᩻֫ۧ;Landroid/content/Intent;)V

    goto :goto_0

    .line 151
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Requirements not met: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 152
    invoke-virtual {p0, p1, v0}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onStopJob(Landroid/app/job/JobParameters;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
