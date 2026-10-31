.class public abstract Ll/᩶ۤ;
.super Ljava/lang/Object;
.source "F5I3"

# interfaces
.implements Ll/ܶۤ;


# instance fields
.field public final ֫:Ll/᩹ۤ;


# direct methods
.method public constructor <init>(Ll/᩹ۤ;)V
    .locals 0

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput-object p1, p0, Ll/᩶ۤ;->֫:Ll/᩹ۤ;

    return-void
.end method


# virtual methods
.method public abstract ֫()Z
.end method

.method public final ֫(ILjava/lang/CharSequence;)Z
    .locals 1

    if-eqz p2, :cond_3

    if-ltz p1, :cond_3

    .line 130
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr v0, p1

    if-ltz v0, :cond_3

    .line 133
    iget-object v0, p0, Ll/᩶ۤ;->֫:Ll/᩹ۤ;

    if-nez v0, :cond_0

    .line 134
    invoke-virtual {p0}, Ll/᩶ۤ;->֫()Z

    move-result p1

    return p1

    .line 140
    :cond_0
    invoke-interface {v0, p1, p2}, Ll/᩹ۤ;->֫(ILjava/lang/CharSequence;)I

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_2

    if-eq p1, p2, :cond_1

    .line 146
    invoke-virtual {p0}, Ll/᩶ۤ;->֫()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    return p2

    .line 131
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
