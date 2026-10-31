.class public final Ll/ܿܿ᩻;
.super Ljava/lang/Object;
.source "195F"


# instance fields
.field public ֫:Z

.field public ۧ:Ljava/lang/String;

.field public final ܽ:I

.field public final ܿ:Ll/֫ܿ᩻;

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(Ll/֫ܿ᩻;Ll/᩶ᩳ᩻;)V
    .locals 0

    .line 1288
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1289
    iput-object p1, p0, Ll/ܿܿ᩻;->ܿ:Ll/֫ܿ᩻;

    .line 1290
    iget p1, p2, Ll/᩶ᩳ᩻;->ܰ:I

    invoke-static {p1}, Ll/᩻ܿ᩻;->ۧ(I)I

    move-result p1

    iput p1, p0, Ll/ܿܿ᩻;->ܽ:I

    .line 1291
    iget-boolean p1, p2, Ll/᩶ᩳ᩻;->۟:Z

    iput-boolean p1, p0, Ll/ܿܿ᩻;->ᩳ:Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 1310
    iget v0, p0, Ll/ܿܿ᩻;->ܽ:I

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ܿܿ᩻;->ܿ:Ll/֫ܿ᩻;

    iget-boolean v3, p0, Ll/ܿܿ᩻;->ᩳ:Z

    if-ne v0, v1, :cond_2

    .line 1311
    iget-boolean v0, p0, Ll/ܿܿ᩻;->֫:Z

    if-nez v0, :cond_0

    if-nez v3, :cond_3

    .line 1344
    :cond_0
    iget-object v0, p0, Ll/ܿܿ᩻;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1345
    invoke-interface {v2, v0}, Ll/֫ܿ᩻;->֫(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1346
    iput-object v0, p0, Ll/ܿܿ᩻;->ۧ:Ljava/lang/String;

    .line 1313
    :cond_1
    invoke-interface {v2}, Ll/֫ܿ᩻;->֫()V

    return-void

    .line 1315
    :cond_2
    iget-boolean v0, p0, Ll/ܿܿ᩻;->֫:Z

    if-nez v0, :cond_4

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    return-void

    .line 1316
    :cond_4
    :goto_0
    invoke-interface {v2}, Ll/֫ܿ᩻;->֫()V

    return-void
.end method

.method public final ֫(C)V
    .locals 2

    .line 1344
    iget-object v0, p0, Ll/ܿܿ᩻;->ۧ:Ljava/lang/String;

    iget-object v1, p0, Ll/ܿܿ᩻;->ܿ:Ll/֫ܿ᩻;

    if-eqz v0, :cond_0

    .line 1345
    invoke-interface {v1, v0}, Ll/֫ܿ᩻;->֫(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1346
    iput-object v0, p0, Ll/ܿܿ᩻;->ۧ:Ljava/lang/String;

    .line 1296
    :cond_0
    invoke-interface {v1, p1}, Ll/֫ܿ᩻;->֫(C)V

    const/4 p1, 0x1

    .line 1297
    iput-boolean p1, p0, Ll/ܿܿ᩻;->֫:Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 1301
    iget-object v2, p0, Ll/ܿܿ᩻;->ܿ:Ll/֫ܿ᩻;

    iget-boolean v3, p0, Ll/ܿܿ᩻;->ᩳ:Z

    iget v4, p0, Ll/ܿܿ᩻;->ܽ:I

    if-ne v4, v0, :cond_3

    .line 1324
    iget-boolean v0, p0, Ll/ܿܿ᩻;->֫:Z

    if-nez v0, :cond_0

    if-nez v3, :cond_2

    .line 1344
    :cond_0
    iget-object v0, p0, Ll/ܿܿ᩻;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1345
    invoke-interface {v2, v0}, Ll/֫ܿ᩻;->֫(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1346
    iput-object v0, p0, Ll/ܿܿ᩻;->ۧ:Ljava/lang/String;

    .line 1326
    :cond_1
    invoke-interface {v2}, Ll/֫ܿ᩻;->֫()V

    .line 1329
    :cond_2
    iput-boolean v1, p0, Ll/ܿܿ᩻;->֫:Z

    .line 1303
    iput-object p1, p0, Ll/ܿܿ᩻;->ۧ:Ljava/lang/String;

    return-void

    :cond_3
    if-eqz v3, :cond_4

    .line 1333
    iget-boolean v0, p0, Ll/ܿܿ᩻;->֫:Z

    if-nez v0, :cond_4

    return-void

    :cond_4
    if-nez v4, :cond_5

    .line 1337
    invoke-interface {v2, p1}, Ll/֫ܿ᩻;->֫(Ljava/lang/String;)V

    .line 1339
    :cond_5
    invoke-interface {v2}, Ll/֫ܿ᩻;->֫()V

    .line 1340
    iput-boolean v1, p0, Ll/ܿܿ᩻;->֫:Z

    return-void
.end method
