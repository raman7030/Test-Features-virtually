.class public final Ll/ۧ᩹ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/nio/file/DirectoryStream;
.implements Ll/ۙ֨ᩴ;


# instance fields
.field public final a:Ljava/nio/file/DirectoryStream;


# direct methods
.method public constructor <init>(Ljava/nio/file/DirectoryStream;)V
    .locals 0

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    iput-object p1, p0, Ll/ۧ᩹ᩴ;->a:Ljava/nio/file/DirectoryStream;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 129
    iget-object v0, p0, Ll/ۧ᩹ᩴ;->a:Ljava/nio/file/DirectoryStream;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 3

    .line 124
    iget-object v0, p0, Ll/ۧ᩹ᩴ;->a:Ljava/nio/file/DirectoryStream;

    new-instance v1, Ll/֫᩹ᩴ;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Ll/֫᩹ᩴ;-><init>(Ljava/util/function/Consumer;I)V

    invoke-static {v0, v1}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 119
    new-instance v0, Ll/֨۠ᩴ;

    iget-object v1, p0, Ll/ۧ᩹ᩴ;->a:Ljava/nio/file/DirectoryStream;

    invoke-interface {v1}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/֨۠ᩴ;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Ll/ۧ᩹ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 2

    .line 101
    invoke-virtual {p0}, Ll/ۧ᩹ᩴ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/᩹۫ᩴ;->b(Ljava/util/Iterator;I)Ll/ܳۨᩴ;

    move-result-object v0

    return-object v0
.end method
