.class public final synthetic Ll/֫᩸᩻;
.super Ljava/lang/Object;
.source "V8F2"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/ܰܺܳ;

.field public final synthetic ᩶:Landroid/widget/TextView;

.field public final synthetic ᩸:Ljava/util/List;

.field public final synthetic ᩹:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Landroid/widget/TextView;Ll/ܰܺܳ;Ljava/util/List;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ll/֫᩸᩻;->᩸:Ljava/util/List;

    iput-object p1, p0, Ll/֫᩸᩻;->᩹:Landroid/widget/TextView;

    iput-object p2, p0, Ll/֫᩸᩻;->᩶:Landroid/widget/TextView;

    iput-object p3, p0, Ll/֫᩸᩻;->ۙ:Ll/ܰܺܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 2
    iget-object v0, p0, Ll/֫᩸᩻;->ۙ:Ll/ܰܺܳ;

    const/16 v1, 0x12c

    .line 148
    invoke-static {v1}, Ll/ۡۤۡ;->֫(I)Ll/ۡۤۡ;

    move-result-object v1

    .line 151
    new-instance v2, Ljava/util/LinkedList;

    iget-object v3, p0, Ll/֫᩸᩻;->᩸:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 152
    :goto_0
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v6

    iget-object v7, p0, Ll/֫᩸᩻;->᩹:Landroid/widget/TextView;

    iget-object v8, p0, Ll/֫᩸᩻;->᩶:Landroid/widget/TextView;

    if-nez v6, :cond_2

    const/4 v6, 0x1

    add-int/2addr v5, v6

    and-int/lit16 v9, v5, 0xff

    if-nez v9, :cond_0

    .line 153
    invoke-virtual {v1}, Ll/ۡۤۡ;->֫()Z

    move-result v9

    if-eqz v9, :cond_0

    .line 156
    new-instance v9, Ll/ܰܶ᩻;

    invoke-direct {v9, v7, v3, v8, v4}, Ll/ܰܶ᩻;-><init>(Landroid/widget/TextView;ILandroid/widget/TextView;I)V

    invoke-static {v9}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 161
    :cond_0
    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ᩳۜܳ;

    .line 162
    invoke-interface {v7}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v8

    if-eqz v8, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 167
    :try_start_0
    invoke-interface {v7}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v7

    .line 199
    invoke-virtual {v0, v7, v6}, Ll/ܰܺܳ;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object v6

    .line 167
    invoke-virtual {v2, v6}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    .line 175
    :cond_2
    new-instance v0, Ll/۟ܶ᩻;

    invoke-direct {v0, v7, v3, v8, v4}, Ll/۟ܶ᩻;-><init>(Landroid/widget/TextView;ILandroid/widget/TextView;I)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
