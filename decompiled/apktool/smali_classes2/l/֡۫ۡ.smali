.class public Ll/֡۫ۡ;
.super Ljava/lang/Object;
.source "8B94"

# interfaces
.implements Ljava/lang/CharSequence;
.implements Landroid/text/GetChars;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/֡۫ۡ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 1

    .line 27
    iget-object v0, p0, Ll/֡۫ۡ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    return p1
.end method

.method public synthetic chars()Ljava/util/stream/IntStream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/֡۫ۡ;->chars()Ll/ۧ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/֫᩺ᩴ;->convert(Ll/ۧ᩺ᩴ;)Ljava/util/stream/IntStream;

    move-result-object v0

    return-object v0
.end method

.method public final chars()Ll/ۧ᩺ᩴ;
    .locals 1

    .line 40
    iget-object v0, p0, Ll/֡۫ۡ;->᩸:Ljava/lang/String;

    invoke-static {v0}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic codePoints()Ljava/util/stream/IntStream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/֡۫ۡ;->codePoints()Ll/ۧ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/֫᩺ᩴ;->convert(Ll/ۧ᩺ᩴ;)Ljava/util/stream/IntStream;

    move-result-object v0

    return-object v0
.end method

.method public final codePoints()Ll/ۧ᩺ᩴ;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/֡۫ۡ;->᩸:Ljava/lang/String;

    invoke-static {v0}, Ll/ᩴۘܿ;->֫(Ljava/lang/String;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final getChars(II[CI)V
    .locals 1

    .line 62
    iget-object v0, p0, Ll/֡۫ۡ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljava/lang/String;->getChars(II[CI)V

    return-void
.end method

.method public final length()I
    .locals 1

    .line 22
    iget-object v0, p0, Ll/֡۫ۡ;->᩸:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/֡۫ۡ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/֡۫ۡ;->᩸:Ljava/lang/String;

    return-object v0
.end method
