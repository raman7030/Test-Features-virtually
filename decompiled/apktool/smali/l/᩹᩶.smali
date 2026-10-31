.class public final Ll/᩹᩶;
.super Ljava/lang/Object;
.source "G3SY"

# interfaces
.implements Ll/۬᩶;


# instance fields
.field public final ֫:Landroid/app/Notification;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/app/Notification;)V
    .locals 0

    .line 1174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1175
    iput-object p1, p0, Ll/᩹᩶;->ۧ:Ljava/lang/String;

    .line 1178
    iput-object p2, p0, Ll/᩹᩶;->֫:Landroid/app/Notification;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1189
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NotifyTask[packageName:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1190
    iget-object v1, p0, Ll/᩹᩶;->ۧ:Ljava/lang/String;

    const-string v2, ", id:1006, tag:null]"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܽ;)V
    .locals 2

    .line 1183
    iget-object v0, p0, Ll/᩹᩶;->ۧ:Ljava/lang/String;

    iget-object v1, p0, Ll/᩹᩶;->֫:Landroid/app/Notification;

    invoke-interface {p1, v0, v1}, Ll/ܽ;->֫(Ljava/lang/String;Landroid/app/Notification;)V

    return-void
.end method
