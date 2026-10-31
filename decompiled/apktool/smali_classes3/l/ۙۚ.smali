.class public final Ll/ۙۚ;
.super Ljava/lang/Object;
.source "L1CU"

# interfaces
.implements Ll/᩶ۚ;


# static fields
.field public static ۧ:Ll/ۙۚ;


# instance fields
.field public ֫:Landroid/view/VelocityTracker;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1071
    new-instance v0, Ll/ۙۚ;

    .line 1069
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1071
    sput-object v0, Ll/ۙۚ;->ۧ:Ll/ۙۚ;

    return-void
.end method

.method public static ֫()Ll/ۙۚ;
    .locals 2

    .line 1074
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    sget-object v1, Ll/ۙۚ;->ۧ:Ll/ۙۚ;

    iput-object v0, v1, Ll/ۙۚ;->֫:Landroid/view/VelocityTracker;

    return-object v1
.end method
