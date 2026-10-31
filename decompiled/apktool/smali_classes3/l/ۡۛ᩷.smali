.class public final Ll/ۡۛ᩷;
.super Ljava/lang/Object;
.source "61KH"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩶:I

.field public final ᩸:Ll/ܶ᩵ܿ;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 4

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, Ll/ۡۛ᩷;->᩸:Ll/ܶ᩵ܿ;

    .line 76
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۛ᩷;->᩹:Ljava/lang/String;

    .line 78
    invoke-static {}, Ll/ܺۛ᩷;->֫()Ll/ۢ᩵ᩴ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ll/ܺۛ᩷;->֫()Ll/ۢ᩵ᩴ;

    move-result-object v2

    const v3, 0x7fffffff

    invoke-virtual {v2, v3, v0}, Ll/ۢ᩵ᩴ;->֫(ILjava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0, p1}, Ll/ۢ᩵ᩴ;->֫(ILjava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۡۛ᩷;->᩶:I

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 69
    check-cast p1, Ll/ۡۛ᩷;

    .line 87
    iget v0, p0, Ll/ۡۛ᩷;->᩶:I

    iget v1, p1, Ll/ۡۛ᩷;->᩶:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-nez v0, :cond_0

    .line 89
    iget-object v0, p0, Ll/ۡۛ᩷;->᩹:Ljava/lang/String;

    iget-object p1, p1, Ll/ۡۛ᩷;->᩹:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method
