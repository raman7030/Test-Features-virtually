.class public final Ll/ۜܺۢ;
.super Ljava/lang/Object;
.source "F1PL"


# instance fields
.field public ֫:I

.field public ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 212
    iput-object p1, p0, Ll/ۜܺۢ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۜܺۢ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۜܺۢ;->֫:I

    return p0
.end method


# virtual methods
.method public final ֫(I)V
    .locals 3

    .line 216
    iput p1, p0, Ll/ۜܺۢ;->֫:I

    .line 217
    new-instance v0, Landroid/content/Intent;

    const-string v1, "bin.mt.protect.ProtectUploadService.ACTION_PROGRESS_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "taskID"

    .line 218
    iget-object v2, p0, Ll/ۜܺۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "progress"

    .line 219
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 220
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    return-void
.end method
