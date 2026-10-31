.class public final Ll/ܰܶۖ;
.super Ll/۟ܶۖ;
.source "05YL"


# instance fields
.field public final synthetic ۧ:Ll/۟ܶۖ;


# direct methods
.method public constructor <init>(Ll/۟ܶۖ;)V
    .locals 0

    .line 50
    iput-object p1, p0, Ll/ܰܶۖ;->ۧ:Ll/۟ܶۖ;

    invoke-direct {p0}, Ll/۟ܶۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 2

    .line 54
    iget-object v0, p0, Ll/ܰܶۖ;->ۧ:Ll/۟ܶۖ;

    iget-object v0, v0, Ll/۟ܶۖ;->֫:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/۟ܶۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Ll/۟ܶۖ;->֫:Ljava/util/ArrayList;

    return-void
.end method
