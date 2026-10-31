.class public final Ll/᩸ܳ֡;
.super Ljava/lang/Object;
.source "OARO"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public ۜ:[I

.field public final ۧ:Ll/ܰܳ֡;

.field public ܳ:[Ll/᩷ۜ֡;

.field public ܽ:[Ll/ᩴ᩻֡;

.field public final ܿ:Ljava/util/ArrayList;

.field public final ᩳ:I

.field public final ᩷:Ljava/util/ArrayList;

.field public ᩻:[Ll/ۢۜ֡;


# direct methods
.method public constructor <init>(Ll/ܰܳ֡;I)V
    .locals 1

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩸ܳ֡;->᩷:Ljava/util/ArrayList;

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩸ܳ֡;->֫:Ljava/util/ArrayList;

    .line 43
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩸ܳ֡;->ܿ:Ljava/util/ArrayList;

    .line 75
    iput-object p1, p0, Ll/᩸ܳ֡;->ۧ:Ll/ܰܳ֡;

    .line 76
    iput p2, p0, Ll/᩸ܳ֡;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۜ᩻֡;
    .locals 2

    .line 122
    iget-object v0, p0, Ll/᩸ܳ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 123
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜ᩻֡;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(ILl/᩵ܳ֡;)Ll/᩻᩷֡;
    .locals 5

    if-ltz p1, :cond_3

    .line 167
    iget-object v0, p0, Ll/᩸ܳ֡;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    .line 172
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ܳ֡;

    .line 173
    invoke-virtual {p0, p1}, Ll/᩸ܳ֡;->֫(Ll/᩺ܳ֡;)Ll/᩻᩷֡;

    move-result-object p1

    const/4 v1, -0x2

    .line 174
    invoke-virtual {p1, v1}, Ll/᩻᩷֡;->ۧ(I)Z

    move-result v2

    if-nez v2, :cond_0

    return-object p1

    .line 178
    :cond_0
    new-instance v2, Ll/᩻᩷֡;

    const/4 v3, 0x0

    new-array v4, v3, [I

    invoke-direct {v2, v4}, Ll/᩻᩷֡;-><init>([I)V

    .line 179
    invoke-virtual {v2, p1}, Ll/᩻᩷֡;->֫(Ll/᩻᩷֡;)V

    .line 180
    invoke-virtual {v2}, Ll/᩻᩷֡;->ܽ()V

    :goto_0
    if-eqz p2, :cond_1

    .line 181
    iget v4, p2, Ll/᩵ܳ֡;->֫:I

    if-ltz v4, :cond_1

    invoke-virtual {p1, v1}, Ll/᩻᩷֡;->ۧ(I)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 182
    iget p1, p2, Ll/᩵ܳ֡;->֫:I

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ܳ֡;

    .line 183
    invoke-virtual {p1, v3}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object p1

    check-cast p1, Ll/ۡۜ֡;

    .line 184
    iget-object p1, p1, Ll/ۡۜ֡;->ܽ:Ll/᩺ܳ֡;

    invoke-virtual {p0, p1}, Ll/᩸ܳ֡;->֫(Ll/᩺ܳ֡;)Ll/᩻᩷֡;

    move-result-object p1

    .line 185
    invoke-virtual {v2, p1}, Ll/᩻᩷֡;->֫(Ll/᩻᩷֡;)V

    .line 186
    invoke-virtual {v2}, Ll/᩻᩷֡;->ܽ()V

    .line 187
    iget-object p2, p2, Ll/᩵ܳ֡;->ۧ:Ll/ۡܳ֡;

    goto :goto_0

    .line 190
    :cond_1
    invoke-virtual {p1, v1}, Ll/᩻᩷֡;->ۧ(I)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    .line 191
    invoke-virtual {v2, p1}, Ll/᩻᩷֡;->֫(I)V

    :cond_2
    return-object v2

    .line 168
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid state number."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩺ܳ֡;)Ll/᩻᩷֡;
    .locals 1

    .line 96
    iget-object v0, p1, Ll/᩺ܳ֡;->ܽ:Ll/᩻᩷֡;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 97
    invoke-virtual {p0, p1, v0}, Ll/᩸ܳ֡;->֫(Ll/᩺ܳ֡;Ll/᩵ܳ֡;)Ll/᩻᩷֡;

    move-result-object v0

    iput-object v0, p1, Ll/᩺ܳ֡;->ܽ:Ll/᩻᩷֡;

    .line 98
    invoke-virtual {v0}, Ll/᩻᩷֡;->ᩳ()V

    .line 99
    iget-object p1, p1, Ll/᩺ܳ֡;->ܽ:Ll/᩻᩷֡;

    return-object p1
.end method

.method public final ֫(Ll/᩺ܳ֡;Ll/᩵ܳ֡;)Ll/᩻᩷֡;
    .locals 7

    .line 85
    new-instance v0, Ll/ۡ᩻֡;

    invoke-direct {v0, p0}, Ll/ۡ᩻֡;-><init>(Ll/᩸ܳ֡;)V

    .line 99
    new-instance v6, Ll/᩻᩷֡;

    const/4 v1, 0x0

    new-array v1, v1, [I

    invoke-direct {v6, v1}, Ll/᩻᩷֡;-><init>([I)V

    if-eqz p2, :cond_0

    .line 101
    iget-object v1, p1, Ll/᩺ܳ֡;->֫:Ll/᩸ܳ֡;

    invoke-static {v1, p2}, Ll/ܽۜ֡;->֫(Ll/᩸ܳ֡;Ll/᩵ܳ֡;)Ll/۠ۜ֡;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    move-object v2, p2

    .line 102
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    new-instance v5, Ljava/util/BitSet;

    invoke-direct {v5}, Ljava/util/BitSet;-><init>()V

    move-object v1, p1

    move-object v3, v6

    invoke-virtual/range {v0 .. v5}, Ll/ۡ᩻֡;->֫(Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/᩻᩷֡;Ljava/util/HashSet;Ljava/util/BitSet;)V

    return-object v6
.end method
