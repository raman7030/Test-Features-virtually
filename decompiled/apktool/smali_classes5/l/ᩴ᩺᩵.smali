.class public final synthetic Ll/ᩴ᩺᩵;
.super Ljava/lang/Object;
.source "WB6R"

# interfaces
.implements Ll/᩹ۖܽ;


# instance fields
.field public final synthetic ᩶:Ll/۬ۤ;

.field public final synthetic ᩸:Ll/ܶ᩵ܿ;

.field public final synthetic ᩹:Ll/ᩴۢᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩵ܿ;Ll/ᩴۢᩴ;Ll/۬ۤ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩺᩵;->᩸:Ll/ܶ᩵ܿ;

    iput-object p2, p0, Ll/ᩴ᩺᩵;->᩹:Ll/ᩴۢᩴ;

    iput-object p3, p0, Ll/ᩴ᩺᩵;->᩶:Ll/۬ۤ;

    return-void
.end method


# virtual methods
.method public final ۧ(I)Ll/ۖۖܽ;
    .locals 4

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩴ᩺᩵;->᩸:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    const/16 v1, 0x64

    const/16 v2, 0x30

    if-ge p1, v1, :cond_0

    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    const/16 v1, 0xa

    if-ge p1, v1, :cond_1

    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "rw"

    .line 43
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->᩷(Ljava/lang/String;)Ll/ۖۖܽ;

    move-result-object v1

    .line 44
    iget-object v2, p0, Ll/ᩴ᩺᩵;->᩹:Ll/ᩴۢᩴ;

    invoke-virtual {v2, p1}, Ll/ᩴۢᩴ;->add(I)Z

    move-result p1

    if-eqz p1, :cond_2

    const-wide/16 v2, 0x0

    .line 45
    invoke-interface {v1, v2, v3}, Ll/ۖۖܽ;->setLength(J)V

    .line 46
    iget-object p1, p0, Ll/ᩴ᩺᩵;->᩶:Ll/۬ۤ;

    invoke-interface {p1, v0}, Ll/۬ۤ;->accept(Ljava/lang/Object;)V

    :cond_2
    return-object v1
.end method
