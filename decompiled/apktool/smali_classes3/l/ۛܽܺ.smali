.class public final Ll/ۛܽܺ;
.super Ll/ܿᩴܺ;
.source "2BF0"


# static fields
.field public static final ᩶:Ll/ۛܽܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 29
    new-instance v0, Ll/ۛܽܺ;

    const/4 v1, 0x0

    .line 67
    invoke-direct {v0, v1}, Ll/ܿᩴܺ;-><init>(I)V

    .line 29
    sput-object v0, Ll/ۛܽܺ;->᩶:Ll/ۛܽܺ;

    return-void
.end method

.method public static ֫(Ll/ۛܽܺ;Ll/ۛܽܺ;)Ll/ۛܽܺ;
    .locals 6

    .line 41
    sget-object v0, Ll/ۛܽܺ;->᩶:Ll/ۛܽܺ;

    if-ne p0, v0, :cond_0

    return-object p1

    .line 46
    :cond_0
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    .line 47
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v1

    .line 48
    new-instance v2, Ll/ۛܽܺ;

    add-int v3, v0, v1

    .line 67
    invoke-direct {v2, v3}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_1

    .line 77
    invoke-virtual {p0, v4}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۤܽܺ;

    .line 91
    invoke-virtual {v2, v4, v5}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ge v3, v1, :cond_2

    add-int p0, v0, v3

    .line 77
    invoke-virtual {p1, v3}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۤܽܺ;

    .line 91
    invoke-virtual {v2, p0, v4}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-object v2
.end method


# virtual methods
.method public final ֫(III)V
    .locals 1

    .line 102
    new-instance v0, Ll/ۤܽܺ;

    invoke-direct {v0, p2, p3}, Ll/ۤܽܺ;-><init>(II)V

    invoke-virtual {p0, p1, v0}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    return-void
.end method

.method public final ᩳ(I)I
    .locals 6

    .line 119
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    .line 77
    invoke-virtual {p0, v3}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۤܽܺ;

    .line 125
    invoke-virtual {v4}, Ll/ۤܽܺ;->ۧ()I

    move-result v5

    if-gt v5, p1, :cond_1

    if-le v5, v1, :cond_1

    .line 128
    invoke-virtual {v4}, Ll/ۤܽܺ;->֫()I

    move-result v1

    if-ne v5, p1, :cond_0

    return v1

    :cond_0
    move v2, v1

    move v1, v5

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method
