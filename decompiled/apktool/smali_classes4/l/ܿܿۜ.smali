.class public final synthetic Ll/ܿܿۜ;
.super Ljava/lang/Object;
.source "L78E"


# instance fields
.field public final synthetic ֫:Ll/֡ܿۜ;

.field public final synthetic ۧ:Ll/ܳ᩻ۜ;


# direct methods
.method public synthetic constructor <init>(Ll/ۚܿۜ;Ll/֡ܿۜ;Ll/ܳ᩻ۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ܿܿۜ;->֫:Ll/֡ܿۜ;

    iput-object p3, p0, Ll/ܿܿۜ;->ۧ:Ll/ܳ᩻ۜ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/۬ۛ֡;
    .locals 2

    .line 1999
    iget-object v0, p0, Ll/ܿܿۜ;->֫:Ll/֡ܿۜ;

    iget-object v1, v0, Ll/֡ܿۜ;->ܳ:Ll/۬ۛ֡;

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/֡ܿۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2000
    iget-object p1, v0, Ll/֡ܿۜ;->ܳ:Ll/۬ۛ֡;

    return-object p1

    .line 60
    :cond_0
    iget-object v1, p0, Ll/ܿܿۜ;->ۧ:Ll/ܳ᩻ۜ;

    invoke-virtual {v1, p1}, Ll/ܳ᩻ۜ;->ۧ(Ljava/lang/String;)Ll/۬ۛ֡;

    move-result-object v1

    .line 2002
    iput-object v1, v0, Ll/֡ܿۜ;->ܳ:Ll/۬ۛ֡;

    .line 2003
    iput-object p1, v0, Ll/֡ܿۜ;->ܿ:Ljava/lang/String;

    return-object v1
.end method
