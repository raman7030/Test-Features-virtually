.class public final Ll/ᩴ᩷ܿ;
.super Ljava/lang/Object;
.source "X6MK"

# interfaces
.implements Ljava/lang/Appendable;
.implements Ljava/lang/CharSequence;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩶:Ll/ۗ᩹ᩳ;

.field public final ᩸:Ll/֨۬ᩳ;

.field public final ᩹:Ll/᩷۠ᩴ;


# direct methods
.method public constructor <init>(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Ll/ᩴ᩷ܿ;->᩹:Ll/᩷۠ᩴ;

    .line 22
    iput-object p2, p0, Ll/ᩴ᩷ܿ;->᩸:Ll/֨۬ᩳ;

    .line 24
    new-instance v0, Ll/ۗ᩹ᩳ;

    const/high16 v1, 0x80000

    invoke-direct {v0, p1, p2, v1}, Ll/ۗ᩹ᩳ;-><init>(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;I)V

    iput-object v0, p0, Ll/ᩴ᩷ܿ;->᩶:Ll/ۗ᩹ᩳ;

    return-void
.end method


# virtual methods
.method public final append(C)Ljava/lang/Appendable;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ᩴ᩷ܿ;->᩶:Ll/ۗ᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/ۗ᩹ᩳ;->append(C)V

    return-object p0
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 0

    .line 6
    invoke-virtual {p0, p1}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    move-result-object p1

    return-object p1
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ᩴ᩷ܿ;->᩶:Ll/ۗ᩹ᩳ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۗ᩹ᩳ;->append(Ljava/lang/CharSequence;II)V

    return-object p0
.end method

.method public final append(C)Ll/ᩴ᩷ܿ;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ᩴ᩷ܿ;->᩶:Ll/ۗ᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/ۗ᩹ᩳ;->append(C)V

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;
    .locals 2

    if-nez p1, :cond_0

    const-string p1, "null"

    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, Ll/ᩴ᩷ܿ;->֫(IILjava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    return-object p0
.end method

.method public final charAt(I)C
    .locals 1

    .line 28
    iget-object v0, p0, Ll/ᩴ᩷ܿ;->᩶:Ll/ۗ᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/ۗ᩹ᩳ;->charAt(I)C

    move-result p1

    return p1
.end method

.method public final close()V
    .locals 1

    .line 36
    iget-object v0, p0, Ll/ᩴ᩷ܿ;->᩶:Ll/ۗ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۗ᩹ᩳ;->close()V

    return-void
.end method

.method public final finish()Ll/۬᩹ᩳ;
    .locals 1

    .line 35
    iget-object v0, p0, Ll/ᩴ᩷ܿ;->᩶:Ll/ۗ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۗ᩹ᩳ;->finish()Ll/۬᩹ᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final length()I
    .locals 1

    .line 27
    iget-object v0, p0, Ll/ᩴ᩷ܿ;->᩶:Ll/ۗ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۗ᩹ᩳ;->length()I

    move-result v0

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 21
    new-instance v0, Ll/۬۬ۡ;

    invoke-direct {v0, p1, p2, p0}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    return-object v0
.end method

.method public final ֫()Ll/ᩴ᩷ܿ;
    .locals 3

    .line 32
    new-instance v0, Ll/ᩴ᩷ܿ;

    iget-object v1, p0, Ll/ᩴ᩷ܿ;->᩹:Ll/᩷۠ᩴ;

    iget-object v2, p0, Ll/ᩴ᩷ܿ;->᩸:Ll/֨۬ᩳ;

    invoke-direct {v0, v1, v2}, Ll/ᩴ᩷ܿ;-><init>(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)V

    return-object v0
.end method

.method public final ֫(IILjava/lang/CharSequence;)Ll/ᩴ᩷ܿ;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ᩴ᩷ܿ;->᩶:Ll/ۗ᩹ᩳ;

    invoke-virtual {v0, p3, p1, p2}, Ll/ۗ᩹ᩳ;->append(Ljava/lang/CharSequence;II)V

    return-object p0
.end method

.method public final ۧ(I)V
    .locals 1

    .line 31
    iget-object v0, p0, Ll/ᩴ᩷ܿ;->᩶:Ll/ۗ᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/ۗ᩹ᩳ;->ۧ(I)V

    return-void
.end method
