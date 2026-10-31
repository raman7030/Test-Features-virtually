.class public final Ll/֡᩶۠;
.super Ljava/lang/Object;
.source "47LN"

# interfaces
.implements Ljava/nio/file/DirectoryStream;


# instance fields
.field public final synthetic ۙ:Ljava/nio/file/DirectoryStream$Filter;

.field public final synthetic ᩶:Ll/۠᩶۠;

.field public ᩸:Z

.field public final synthetic ᩹:Ll/ۚ᩶۠;


# direct methods
.method public constructor <init>(Ll/ۚ᩶۠;Ljava/nio/file/DirectoryStream$Filter;Ll/۠᩶۠;)V
    .locals 0

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡᩶۠;->᩹:Ll/ۚ᩶۠;

    iput-object p2, p0, Ll/֡᩶۠;->ۙ:Ljava/nio/file/DirectoryStream$Filter;

    iput-object p3, p0, Ll/֡᩶۠;->᩶:Ll/۠᩶۠;

    const/4 p1, 0x0

    .line 148
    iput-boolean p1, p0, Ll/֡᩶۠;->᩸:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x1

    .line 152
    iput-boolean v0, p0, Ll/֡᩶۠;->᩸:Z

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 158
    iget-boolean v0, p0, Ll/֡᩶۠;->᩸:Z

    if-nez v0, :cond_1

    .line 161
    iget-object v0, p0, Ll/֡᩶۠;->ۙ:Ljava/nio/file/DirectoryStream$Filter;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۘ᩶۠;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۘ᩶۠;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v1, Ll/ᩴ᩶۠;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Ll/ᩴ᩶۠;-><init>(ILjava/lang/Object;)V

    move-object v0, v1

    .line 168
    :goto_0
    iget-object v1, p0, Ll/֡᩶۠;->᩹:Ll/ۚ᩶۠;

    invoke-static {v1}, Ll/ۚ᩶۠;->֫(Ll/ۚ᩶۠;)Ll/᩻ܰۡ;

    move-result-object v1

    iget-object v2, p0, Ll/֡᩶۠;->᩶:Ll/۠᩶۠;

    iget-object v2, v2, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/֨᩺ۡ;->ۧ(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 169
    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/᩵᩶۠;

    invoke-direct {v2, p0}, Ll/᩵᩶۠;-><init>(Ll/֡᩶۠;)V

    .line 170
    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    .line 171
    invoke-interface {v1, v0}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 172
    invoke-interface {v0}, Ll/۫ۨᩴ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    .line 159
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DirectoryStream is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
