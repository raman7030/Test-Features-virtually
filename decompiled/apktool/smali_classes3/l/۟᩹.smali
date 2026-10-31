.class public final Ll/۟᩹;
.super Ll/֫᩶;
.source "268P"


# instance fields
.field public final ܿ:Landroid/app/job/JobScheduler;

.field public final ᩳ:Landroid/app/job/JobInfo;


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;Landroid/content/ComponentName;I)V
    .locals 1

    .line 336
    invoke-direct {p0, p2}, Ll/֫᩶;-><init>(Landroid/content/ComponentName;)V

    .line 337
    invoke-virtual {p0, p3}, Ll/֫᩶;->֫(I)V

    .line 338
    new-instance v0, Landroid/app/job/JobInfo$Builder;

    invoke-direct {v0, p3, p2}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    const-wide/16 p2, 0x0

    .line 339
    invoke-virtual {v0, p2, p3}, Landroid/app/job/JobInfo$Builder;->setOverrideDeadline(J)Landroid/app/job/JobInfo$Builder;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object p2

    iput-object p2, p0, Ll/۟᩹;->ᩳ:Landroid/app/job/JobInfo;

    .line 340
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "jobscheduler"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/job/JobScheduler;

    iput-object p1, p0, Ll/۟᩹;->ܿ:Landroid/app/job/JobScheduler;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Intent;)V
    .locals 2

    .line 347
    new-instance v0, Landroid/app/job/JobWorkItem;

    invoke-direct {v0, p1}, Landroid/app/job/JobWorkItem;-><init>(Landroid/content/Intent;)V

    iget-object p1, p0, Ll/۟᩹;->ܿ:Landroid/app/job/JobScheduler;

    iget-object v1, p0, Ll/۟᩹;->ᩳ:Landroid/app/job/JobInfo;

    invoke-virtual {p1, v1, v0}, Landroid/app/job/JobScheduler;->enqueue(Landroid/app/job/JobInfo;Landroid/app/job/JobWorkItem;)I

    return-void
.end method
