.class public interface abstract Ll/ܽ;
.super Ljava/lang/Object;
.source "43G9"

# interfaces
.implements Landroid/os/IInterface;


# static fields
.field public static final ֫:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x24

    const/16 v1, 0x2e

    const-string v2, "android$support$v4$app$INotificationSideChannel"

    .line 176
    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܽ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract ֫(Ljava/lang/String;Landroid/app/Notification;)V
.end method
