.class public final synthetic Ll/ܳܰ᩻;
.super Ljava/lang/Object;
.source "P77N"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩸:Ll/ۤܰ᩻;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ۤܰ᩻;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳܰ᩻;->᩸:Ll/ۤܰ᩻;

    iput-object p2, p0, Ll/ܳܰ᩻;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 3

    .line 2
    check-cast p1, Ll/֡ۜۜ;

    .line 3906
    iget-object v0, p0, Ll/ܳܰ᩻;->᩸:Ll/ۤܰ᩻;

    iget-object v1, v0, Ll/ۤܰ᩻;->ۧ:Ljava/lang/String;

    iget-object v2, p1, Ll/֡ۜۜ;->֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Ll/ۤܰ᩻;->ܽ:Ljava/lang/String;

    iget-object v1, p1, Ll/֡ۜۜ;->ܽ:Ljava/lang/String;

    .line 3907
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Ll/֡ۜۜ;->᩷:Ljava/lang/String;

    .line 3908
    iget-object v0, p0, Ll/ܳܰ᩻;->᩹:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
