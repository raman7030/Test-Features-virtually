.class public final Ll/ۗۤ;
.super Ljava/lang/Object;
.source "F5I3"


# static fields
.field public static final ֫:Ll/ܶۤ;

.field public static final ۧ:Ll/ܶۤ;

.field public static final ܽ:Ll/ܶۤ;

.field public static final ᩳ:Ll/ܶۤ;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 33
    new-instance v0, Ll/ۙۤ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۙۤ;-><init>(Ll/᩸ۤ;Z)V

    sput-object v0, Ll/ۗۤ;->ܽ:Ll/ܶۤ;

    .line 39
    new-instance v0, Ll/ۙۤ;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Ll/ۙۤ;-><init>(Ll/᩸ۤ;Z)V

    sput-object v0, Ll/ۗۤ;->ᩳ:Ll/ܶۤ;

    .line 47
    new-instance v0, Ll/ۙۤ;

    sget-object v1, Ll/᩸ۤ;->֫:Ll/᩸ۤ;

    invoke-direct {v0, v1, v2}, Ll/ۙۤ;-><init>(Ll/᩸ۤ;Z)V

    sput-object v0, Ll/ۗۤ;->֫:Ll/ܶۤ;

    .line 55
    new-instance v0, Ll/ۙۤ;

    invoke-direct {v0, v1, v3}, Ll/ۙۤ;-><init>(Ll/᩸ۤ;Z)V

    sput-object v0, Ll/ۗۤ;->ۧ:Ll/ܶۤ;

    return-void
.end method
