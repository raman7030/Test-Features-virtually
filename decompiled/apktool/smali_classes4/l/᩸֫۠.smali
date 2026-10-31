.class public final synthetic Ll/᩸֫۠;
.super Ljava/lang/Object;
.source "A451"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic ᩸:Ll/᩶֫۠;

.field public final synthetic ᩹:Ll/ۖܶ۠;


# direct methods
.method public synthetic constructor <init>(Ll/᩶֫۠;Ll/ۖܶ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸֫۠;->᩸:Ll/᩶֫۠;

    iput-object p2, p0, Ll/᩸֫۠;->᩹:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 2077
    new-instance v0, Ll/᩹֫۠;

    iget-object v1, p0, Ll/᩸֫۠;->᩸:Ll/᩶֫۠;

    invoke-direct {v0, v1}, Ll/᩹֫۠;-><init>(Ll/᩶֫۠;)V

    iget-object v1, p0, Ll/᩸֫۠;->᩹:Ll/ۖܶ۠;

    invoke-static {v1, v0}, Ll/᩹۠۠;->֫(Ljava/lang/Iterable;Ljava/util/function/Function;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
