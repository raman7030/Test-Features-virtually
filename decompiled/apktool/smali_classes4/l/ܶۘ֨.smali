.class public final synthetic Ll/ܶۘ֨;
.super Ljava/lang/Object;
.source "P7M1"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩶:Ll/ۛ۠۠;

.field public final synthetic ᩸:Ll/ᩳ᩶۠;

.field public final synthetic ᩹:Ll/ܽܶ۠;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳ᩶۠;Ll/ܽܶ۠;Ll/ۛ۠۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۘ֨;->᩸:Ll/ᩳ᩶۠;

    iput-object p2, p0, Ll/ܶۘ֨;->᩹:Ll/ܽܶ۠;

    iput-object p3, p0, Ll/ܶۘ֨;->᩶:Ll/ۛ۠۠;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 785
    iget-object v0, p0, Ll/ܶۘ֨;->᩸:Ll/ᩳ᩶۠;

    invoke-interface {v0}, Ll/ᩳ᩶۠;->֫()Ll/ܽ᩶۠;

    move-result-object v1

    sget-object v2, Ll/ܽ᩶۠;->۬:Ll/ܽ᩶۠;

    if-ne v1, v2, :cond_0

    const-string v1, "bad.source.file.header"

    goto :goto_0

    :cond_0
    const-string v1, "bad.class.file.header"

    :goto_0
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    .line 787
    iget-object v3, p0, Ll/ܶۘ֨;->᩹:Ll/ܽܶ۠;

    aput-object v3, v2, v0

    iget-object v0, p0, Ll/ܶۘ֨;->᩶:Ll/ۛ۠۠;

    invoke-virtual {v0, v1, v2}, Ll/ۛ۠۠;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v0

    return-object v0
.end method
