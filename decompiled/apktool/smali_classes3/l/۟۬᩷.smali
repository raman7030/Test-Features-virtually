.class public final Ll/۟۬᩷;
.super Ll/۬ۗܿ;
.source "81ID"


# instance fields
.field public final synthetic ֫֫:Ll/᩹۬᩷;

.field public final synthetic ۟:Ll/֫۫᩷;


# direct methods
.method public constructor <init>(Ll/֫۫᩷;Ll/ۗܺ᩷;Ll/᩹۬᩷;)V
    .locals 0

    .line 195
    iput-object p1, p0, Ll/۟۬᩷;->۟:Ll/֫۫᩷;

    iput-object p3, p0, Ll/۟۬᩷;->֫֫:Ll/᩹۬᩷;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 3

    .line 199
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    .line 200
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 201
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/۟۬᩷;->֫֫:Ll/᩹۬᩷;

    iget-object v2, v1, Ll/᩹۬᩷;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 204
    :cond_0
    :try_start_0
    iget-object v1, v1, Ll/᩹۬᩷;->᩶:Ll/ܶ᩵ܿ;

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 208
    :catch_0
    iget-object v0, p0, Ll/۟۬᩷;->۟:Ll/֫۫᩷;

    invoke-static {v0}, Ll/֫۫᩷;->ܿ(Ll/֫۫᩷;)Ll/᩶۬᩷;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩶۬᩷;->֫()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Ll/֫۫᩷;->֫(Ll/֫۫᩷;Ljava/util/ArrayList;)V

    .line 209
    invoke-static {v0}, Ll/֫۫᩷;->ᩳ(Ll/֫۫᩷;)Landroid/widget/BaseAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_1
    :goto_0
    return-void
.end method
