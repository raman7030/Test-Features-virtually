.class public final Ll/᩺ۙۡ;
.super Ljava/util/AbstractSet;
.source "51V0"


# instance fields
.field public final synthetic ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 368
    iput-object p1, p0, Ll/᩺ۙۡ;->᩸:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 372
    iget-object v0, p0, Ll/᩺ۙۡ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 377
    iget-object v0, p0, Ll/᩺ۙۡ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method
