.class public final Ll/۬ۨ֫;
.super Ljava/lang/Object;
.source "E7M5"

# interfaces
.implements Ll/ۧ᩺֫;


# instance fields
.field public final synthetic ᩸:Ll/۫ۨ֫;


# direct methods
.method public constructor <init>(Ll/۫ۨ֫;)V
    .locals 0

    .line 960
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ۨ֫;->᩸:Ll/۫ۨ֫;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 11

    .line 963
    iget-object v0, p0, Ll/۬ۨ֫;->᩸:Ll/۫ۨ֫;

    invoke-static {v0}, Ll/۫ۨ֫;->ۧ(Ll/۫ۨ֫;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, Ll/۫ۨ֫;->֫(Ll/۫ۨ֫;I)V

    if-lez v1, :cond_0

    return-void

    .line 968
    :cond_0
    invoke-static {v0}, Ll/۫ۨ֫;->ᩳ(Ll/۫ۨ֫;)[Ll/ܿ᩺֫;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v5, v1, v3

    .line 969
    invoke-virtual {v5}, Ll/ܿ᩺֫;->᩻()Ll/ۛܽۧ;

    move-result-object v5

    iget v5, v5, Ll/ۛܽۧ;->ۧ:I

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 971
    :cond_1
    new-array v1, v4, [Ll/۬᩵֫;

    .line 973
    invoke-static {v0}, Ll/۫ۨ֫;->ᩳ(Ll/۫ۨ֫;)[Ll/ܿ᩺֫;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge v4, v3, :cond_3

    aget-object v6, v2, v4

    .line 974
    invoke-virtual {v6}, Ll/ܿ᩺֫;->᩻()Ll/ۛܽۧ;

    move-result-object v7

    iget v7, v7, Ll/ۛܽۧ;->ۧ:I

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v7, :cond_2

    add-int/lit8 v9, v5, 0x1

    .line 976
    invoke-virtual {v6}, Ll/ܿ᩺֫;->᩻()Ll/ۛܽۧ;

    move-result-object v10

    invoke-virtual {v10, v8}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object v10

    aput-object v10, v1, v5

    add-int/lit8 v8, v8, 0x1

    move v5, v9

    goto :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 979
    :cond_3
    new-instance v2, Ll/ۛܽۧ;

    invoke-direct {v2, v1}, Ll/ۛܽۧ;-><init>([Ll/۬᩵֫;)V

    invoke-static {v0, v2}, Ll/۫ۨ֫;->֫(Ll/۫ۨ֫;Ll/ۛܽۧ;)V

    .line 980
    invoke-static {v0}, Ll/۫ۨ֫;->֫(Ll/۫ۨ֫;)Ll/᩷ۧۧ;

    move-result-object v1

    invoke-interface {v1, v0}, Ll/᩷ۧۧ;->֫(Ll/ۢۧۧ;)V

    return-void
.end method

.method public final ֫(Ll/֡ܽۧ;)V
    .locals 1

    .line 990
    iget-object p1, p0, Ll/۬ۨ֫;->᩸:Ll/۫ۨ֫;

    invoke-static {p1}, Ll/۫ۨ֫;->֫(Ll/۫ۨ֫;)Ll/᩷ۧۧ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/᩵ܽۧ;->֫(Ll/֡ܽۧ;)V

    return-void
.end method
