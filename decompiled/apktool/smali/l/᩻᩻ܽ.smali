.class public final Ll/᩻᩻ܽ;
.super Ljava/lang/Object;
.source "01EH"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:[Ll/᩸᩻ܽ;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(III)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 51
    iput v0, p0, Ll/᩻᩻ܽ;->ܳ:I

    .line 52
    iput p1, p0, Ll/᩻᩻ܽ;->ۧ:I

    const/4 p1, 0x0

    .line 53
    iput-object p1, p0, Ll/᩻᩻ܽ;->ᩳ:Ljava/lang/String;

    .line 54
    iput-object p1, p0, Ll/᩻᩻ܽ;->ܿ:[Ll/᩸᩻ܽ;

    .line 55
    iput p2, p0, Ll/᩻᩻ܽ;->ܽ:I

    .line 56
    iput p3, p0, Ll/᩻᩻ܽ;->֫:I

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;[Ll/᩸᩻ܽ;II)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput p1, p0, Ll/᩻᩻ܽ;->ܳ:I

    .line 20
    iput p2, p0, Ll/᩻᩻ܽ;->ۧ:I

    .line 21
    iput-object p3, p0, Ll/᩻᩻ܽ;->ᩳ:Ljava/lang/String;

    .line 22
    iput-object p4, p0, Ll/᩻᩻ܽ;->ܿ:[Ll/᩸᩻ܽ;

    .line 23
    iput p5, p0, Ll/᩻᩻ܽ;->ܽ:I

    .line 24
    iput p6, p0, Ll/᩻᩻ܽ;->֫:I

    return-void
.end method

.method public constructor <init>(Ll/ۙܿܽ;II)V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-virtual {p1}, Ll/ۛᩳܽ;->ᩳ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 29
    iput v0, p0, Ll/᩻᩻ܽ;->ܳ:I

    const/4 v0, -0x1

    .line 30
    iput v0, p0, Ll/᩻᩻ܽ;->ۧ:I

    .line 13
    invoke-virtual {p1}, Ll/ۙܿܽ;->ܿۧ()Ll/ۗܿܽ;

    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ll/ۗܿܽ;->getValue()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩻᩻ܽ;->ᩳ:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, Ll/ۙܿܽ;->ܿۧ()Ll/ۗܿܽ;

    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ll/ۗܿܽ;->ܰ֫()[Ll/᩸᩻ܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩻᩻ܽ;->ܿ:[Ll/᩸᩻ܽ;

    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p1}, Ll/ۛᩳܽ;->ۤ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    .line 34
    iput v0, p0, Ll/᩻᩻ܽ;->ܳ:I

    .line 35
    invoke-virtual {p1}, Ll/ۙܿܽ;->getValue()I

    move-result p1

    iput p1, p0, Ll/᩻᩻ܽ;->ۧ:I

    .line 36
    iput-object v1, p0, Ll/᩻᩻ܽ;->ᩳ:Ljava/lang/String;

    .line 37
    iput-object v1, p0, Ll/᩻᩻ܽ;->ܿ:[Ll/᩸᩻ܽ;

    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p1}, Ll/ۛᩳܽ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    .line 39
    iput v0, p0, Ll/᩻᩻ܽ;->ܳ:I

    .line 40
    invoke-virtual {p1}, Ll/ۙܿܽ;->getValue()I

    move-result p1

    iput p1, p0, Ll/᩻᩻ܽ;->ۧ:I

    .line 41
    iput-object v1, p0, Ll/᩻᩻ܽ;->ᩳ:Ljava/lang/String;

    .line 42
    iput-object v1, p0, Ll/᩻᩻ܽ;->ܿ:[Ll/᩸᩻ܽ;

    .line 46
    :goto_0
    iput p2, p0, Ll/᩻᩻ܽ;->ܽ:I

    .line 47
    iput p3, p0, Ll/᩻᩻ܽ;->֫:I

    return-void

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method
