.class public Ll/ۧۗۚ;
.super Ll/ܺۙۚ;
.source "W6B0"


# instance fields
.field public ܳ:I

.field public ܿ:Ll/᩺᩶ۚ;


# direct methods
.method public constructor <init>(ILl/᩺᩶ۚ;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 62
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۧۗۚ;-><init>(ILl/᩺᩶ۚ;Ljava/lang/String;I)V

    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ll/ۧۗۚ;

    if-ne p1, p2, :cond_0

    return-void

    .line 64
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public constructor <init>(ILl/᩺᩶ۚ;Ljava/lang/String;I)V
    .locals 0

    const/4 p4, 0x0

    .line 81
    invoke-direct {p0, p3, p4}, Ll/ܺۙۚ;-><init>(Ljava/lang/String;I)V

    .line 82
    iput p1, p0, Ll/ۧۗۚ;->ܳ:I

    .line 83
    iput-object p2, p0, Ll/ۧۗۚ;->ܿ:Ll/᩺᩶ۚ;

    return-void
.end method
