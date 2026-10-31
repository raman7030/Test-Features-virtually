.class public final Ll/֫ۗܺ;
.super Ll/ᩳۙܺ;
.source "O2OZ"


# instance fields
.field public final synthetic ᩶:Ll/ܽۗܺ;

.field public final ᩸:Ljava/lang/Object;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ܽۗܺ;I)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 817
    iput-object p1, p0, Ll/֫ۗܺ;->᩶:Ll/ܽۗܺ;

    .line 818
    invoke-static {p1, p2}, Ll/ܽۗܺ;->֫(Ll/ܽۗܺ;I)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ll/֫ۗܺ;->᩸:Ljava/lang/Object;

    .line 819
    iput p2, p0, Ll/֫ۗܺ;->᩹:I

    return-void
.end method

.method private ۧ()V
    .locals 4

    .line 829
    iget v0, p0, Ll/֫ۗܺ;->᩹:I

    const/4 v1, -0x1

    iget-object v2, p0, Ll/֫ۗܺ;->᩸:Ljava/lang/Object;

    iget-object v3, p0, Ll/֫ۗܺ;->᩶:Ll/ܽۗܺ;

    if-eq v0, v1, :cond_1

    .line 830
    invoke-virtual {v3}, Ll/ܽۗܺ;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget v0, p0, Ll/֫ۗܺ;->᩹:I

    .line 831
    invoke-static {v3, v0}, Ll/ܽۗܺ;->֫(Ll/ܽۗܺ;I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 832
    :cond_1
    :goto_0
    invoke-static {v3, v2}, Ll/ܽۗܺ;->ۧ(Ll/ܽۗܺ;Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Ll/֫ۗܺ;->᩹:I

    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 825
    iget-object v0, p0, Ll/֫ۗܺ;->᩸:Ljava/lang/Object;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 3

    .line 839
    iget-object v0, p0, Ll/֫ۗܺ;->᩶:Ll/ܽۗܺ;

    invoke-virtual {v0}, Ll/ܽۗܺ;->֫()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 845
    iget-object v0, p0, Ll/֫ۗܺ;->᩸:Ljava/lang/Object;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 847
    :cond_0
    invoke-direct {p0}, Ll/֫ۗܺ;->ۧ()V

    .line 856
    iget v1, p0, Ll/֫ۗܺ;->᩹:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-static {v0, v1}, Ll/ܽۗܺ;->ۧ(Ll/ܽۗܺ;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 862
    iget-object v0, p0, Ll/֫ۗܺ;->᩶:Ll/ܽۗܺ;

    invoke-virtual {v0}, Ll/ܽۗܺ;->֫()Ljava/util/Map;

    move-result-object v1

    .line 863
    iget-object v2, p0, Ll/֫ۗܺ;->᩸:Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 864
    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 866
    :cond_0
    invoke-direct {p0}, Ll/֫ۗܺ;->ۧ()V

    .line 867
    iget v1, p0, Ll/֫ۗܺ;->᩹:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_1

    .line 868
    invoke-virtual {v0, v2, p1}, Ll/ܽۗܺ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return-object p1

    .line 871
    :cond_1
    invoke-static {v0, v1}, Ll/ܽۗܺ;->ۧ(Ll/ܽۗܺ;I)Ljava/lang/Object;

    move-result-object v1

    .line 872
    iget v2, p0, Ll/֫ۗܺ;->᩹:I

    invoke-static {v0, v2, p1}, Ll/ܽۗܺ;->֫(Ll/ܽۗܺ;ILjava/lang/Object;)V

    return-object v1
.end method
