.class public final Ll/֡ۚ᩷;
.super Ljava/lang/Object;
.source "E72G"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public ۧ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1618
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1619
    iput-object p1, p0, Ll/֡ۚ᩷;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 1624
    iput-boolean v0, p0, Ll/֡ۚ᩷;->ۧ:Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 1629
    iget-boolean v0, p0, Ll/֡ۚ᩷;->ۧ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֡ۚ᩷;->֫:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
