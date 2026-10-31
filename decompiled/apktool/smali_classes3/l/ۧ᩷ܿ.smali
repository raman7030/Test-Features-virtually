.class public final Ll/ۧ᩷ܿ;
.super Ljava/lang/Object;
.source "B4S2"


# instance fields
.field public final ֫:Ll/ܿ᩷ܿ;

.field public final ۧ:Ll/ܶۜܿ;


# direct methods
.method public constructor <init>(Ll/ܿ᩷ܿ;Ll/ܶۜܿ;)V
    .locals 0

    .line 215
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 216
    iput-object p1, p0, Ll/ۧ᩷ܿ;->֫:Ll/ܿ᩷ܿ;

    .line 217
    iput-object p2, p0, Ll/ۧ᩷ܿ;->ۧ:Ll/ܶۜܿ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 238
    iget-object v0, p0, Ll/ۧ᩷ܿ;->֫:Ll/ܿ᩷ܿ;

    invoke-static {v0}, Ll/ܿ᩷ܿ;->ܳ(Ll/ܿ᩷ܿ;)I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ܶۜܿ;
    .locals 5

    .line 280
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "."

    .line 224
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    iget-object v2, p0, Ll/ۧ᩷ܿ;->֫:Ll/ܿ᩷ܿ;

    iget-object v3, p0, Ll/ۧ᩷ܿ;->ۧ:Ll/ܶۜܿ;

    if-eqz v1, :cond_2

    .line 225
    invoke-virtual {v3}, Ll/ܶۜܿ;->ܺ()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 280
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 226
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v3

    .line 228
    :cond_1
    invoke-static {v2, p1}, Ll/ܿ᩷ܿ;->֫(Ll/ܿ᩷ܿ;Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object p1

    return-object p1

    .line 231
    :cond_2
    invoke-virtual {v3}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 280
    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 232
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-object v3

    .line 233
    :cond_3
    invoke-static {v2, p1}, Ll/ܿ᩷ܿ;->ۧ(Ll/ܿ᩷ܿ;Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object p1

    return-object p1
.end method
