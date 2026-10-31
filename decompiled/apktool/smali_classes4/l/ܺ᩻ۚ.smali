.class public final Ll/ܺ᩻ۚ;
.super Ljava/util/AbstractList;
.source "C2RY"


# instance fields
.field public final synthetic ᩸:Ljava/util/List;

.field public final synthetic ᩹:Ll/ᩳ᩻ۚ;


# direct methods
.method public constructor <init>(Ll/ᩳ᩻ۚ;Ljava/util/List;)V
    .locals 0

    .line 110
    iput-object p1, p0, Ll/ܺ᩻ۚ;->᩹:Ll/ᩳ᩻ۚ;

    iput-object p2, p0, Ll/ܺ᩻ۚ;->᩸:Ljava/util/List;

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 113
    iget-object v0, p0, Ll/ܺ᩻ۚ;->᩸:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Ll/ܺ᩻ۚ;->᩹:Ll/ᩳ᩻ۚ;

    invoke-static {v0, p1}, Ll/᩸᩻ۚ;->֫(Ll/ᩳ᩻ۚ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 118
    iget-object v0, p0, Ll/ܺ᩻ۚ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
