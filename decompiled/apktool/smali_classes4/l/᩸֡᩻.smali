.class public final Ll/᩸֡᩻;
.super Ljava/lang/Object;
.source "N9ZJ"


# instance fields
.field public final synthetic ֫:Ll/۬֡᩻;

.field public final synthetic ۧ:Ll/᩶֡᩻;

.field public final synthetic ܽ:Ll/ܺ֡᩻;


# direct methods
.method public constructor <init>(Ll/۬֡᩻;Ll/᩶֡᩻;Ll/ܺ֡᩻;)V
    .locals 0

    .line 576
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸֡᩻;->֫:Ll/۬֡᩻;

    iput-object p2, p0, Ll/᩸֡᩻;->ۧ:Ll/᩶֡᩻;

    iput-object p3, p0, Ll/᩸֡᩻;->ܽ:Ll/ܺ֡᩻;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۤ᩵᩻;)V
    .locals 2

    .line 584
    iget-object v0, p0, Ll/᩸֡᩻;->֫:Ll/۬֡᩻;

    invoke-static {v0}, Ll/۬֡᩻;->֫(Ll/۬֡᩻;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 585
    :try_start_0
    iget-object v1, p0, Ll/᩸֡᩻;->ۧ:Ll/᩶֡᩻;

    iget-boolean v1, v1, Ll/᩶֡᩻;->ۧ:Z

    if-eqz v1, :cond_0

    .line 586
    iget-object v1, p0, Ll/᩸֡᩻;->ۧ:Ll/᩶֡᩻;

    iget-object v1, v1, Ll/᩶֡᩻;->ܽ:Ll/۫֡᩻;

    invoke-static {p1}, Ll/֫֡᩻;->֫(Ll/ۤ᩵᩻;)V

    .line 587
    monitor-exit v0

    return-void

    .line 589
    :cond_0
    iget-object v1, p0, Ll/᩸֡᩻;->ۧ:Ll/᩶֡᩻;

    iget-object v1, v1, Ll/᩶֡᩻;->ܽ:Ll/۫֡᩻;

    invoke-static {p1}, Ll/֫֡᩻;->ۧ(Ll/ۤ᩵᩻;)V

    .line 590
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
