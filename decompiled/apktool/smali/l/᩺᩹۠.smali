.class public final Ll/᩺᩹۠;
.super Ljava/lang/Object;
.source "Q398"

# interfaces
.implements Ll/ܰ᩹۠;


# instance fields
.field public ֫:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v0

    .line 44
    iput-object v0, p0, Ll/᩺᩹۠;->֫:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/List;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/᩺᩹۠;->֫:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܽܶ۠;)V
    .locals 1

    .line 52
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    iget-object v0, p0, Ll/᩺᩹۠;->֫:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
