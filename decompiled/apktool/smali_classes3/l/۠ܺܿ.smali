.class public final Ll/۠ܺܿ;
.super Ljava/lang/Object;
.source "86ZM"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:[I

.field public final ܽ:Z

.field public final ܿ:Ll/᩸᩷ܿ;

.field public final ᩳ:[Ll/ܶۜܿ;

.field public final ᩻:[Ljava/lang/String;


# direct methods
.method public constructor <init>(IZ[Ljava/lang/String;I[I[Ll/ܶۜܿ;Ll/᩸᩷ܿ;)V
    .locals 0

    .line 707
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 708
    iput p1, p0, Ll/۠ܺܿ;->֫:I

    .line 709
    iput-boolean p2, p0, Ll/۠ܺܿ;->ܽ:Z

    if-nez p3, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 710
    :cond_0
    invoke-virtual {p3}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    :goto_0
    iput-object p1, p0, Ll/۠ܺܿ;->᩻:[Ljava/lang/String;

    .line 711
    iput p4, p0, Ll/۠ܺܿ;->ۧ:I

    .line 712
    iput-object p5, p0, Ll/۠ܺܿ;->ܳ:[I

    .line 713
    iput-object p6, p0, Ll/۠ܺܿ;->ᩳ:[Ll/ܶۜܿ;

    .line 714
    iput-object p7, p0, Ll/۠ܺܿ;->ܿ:Ll/᩸᩷ܿ;

    return-void
.end method
