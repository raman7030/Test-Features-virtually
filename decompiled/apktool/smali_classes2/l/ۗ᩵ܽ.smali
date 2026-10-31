.class public final Ll/ۗ᩵ܽ;
.super Ljava/lang/Object;
.source "S6PK"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ۧۚܽ;

.field public final ܽ:Z


# direct methods
.method public constructor <init>(IZ)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput p1, p0, Ll/ۗ᩵ܽ;->֫:I

    .line 11
    iput-boolean p2, p0, Ll/ۗ᩵ܽ;->ܽ:Z

    if-eqz p2, :cond_0

    .line 12
    invoke-static {}, Ll/ۙ᩵ܽ;->ᩳ()Ll/ۧۚܽ;

    move-result-object p1

    invoke-static {p1}, Ll/۟᩵ܽ;->ᩳ(Ll/ۧۚܽ;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ll/ۗ᩵ܽ;->ۧ:Ll/ۧۚܽ;

    return-void
.end method
