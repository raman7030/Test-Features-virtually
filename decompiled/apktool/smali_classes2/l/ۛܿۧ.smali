.class public final Ll/ۛܿۧ;
.super Ljava/lang/Object;
.source "N8QX"


# instance fields
.field public ֫:Ll/ܳ֨֫;

.field public final ۧ:Landroid/content/Context;

.field public final ܽ:Ljava/util/HashMap;

.field public ܿ:I

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 4

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 152
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/ۛܿۧ;->ۧ:Landroid/content/Context;

    const/16 p1, 0x7d0

    .line 147
    iput p1, p0, Ll/ۛܿۧ;->ܿ:I

    .line 148
    sget-object p1, Ll/ܽۚ֫;->֫:Ll/ܳ֨֫;

    iput-object p1, p0, Ll/ۛܿۧ;->֫:Ll/ܳ֨֫;

    const/4 p1, 0x1

    .line 149
    iput-boolean p1, p0, Ll/ۛܿۧ;->ᩳ:Z

    .line 150
    new-instance p1, Ljava/util/HashMap;

    const/16 v1, 0x8

    invoke-direct {p1, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, p0, Ll/ۛܿۧ;->ܽ:Ljava/util/HashMap;

    const/4 v1, 0x0

    .line 151
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-wide/32 v2, 0xf4240

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x2

    .line 152
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x3

    .line 153
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x4

    .line 154
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x5

    .line 155
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0xa

    .line 156
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x9

    .line 157
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x7

    .line 158
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۨܿۧ;
    .locals 7

    .line 252
    new-instance v6, Ll/ۨܿۧ;

    iget-object v4, p0, Ll/ۛܿۧ;->֫:Ll/ܳ֨֫;

    iget-boolean v5, p0, Ll/ۛܿۧ;->ᩳ:Z

    iget-object v1, p0, Ll/ۛܿۧ;->ۧ:Landroid/content/Context;

    iget-object v2, p0, Ll/ۛܿۧ;->ܽ:Ljava/util/HashMap;

    iget v3, p0, Ll/ۛܿۧ;->ܿ:I

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۨܿۧ;-><init>(Landroid/content/Context;Ljava/util/HashMap;ILl/ܳ֨֫;Z)V

    return-object v6
.end method
