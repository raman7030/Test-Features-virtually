.class public final synthetic Ll/ۘ֫֨;
.super Ljava/lang/Object;
.source "C5BI"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/֨֫֨;


# direct methods
.method public synthetic constructor <init>(Ll/֨֫֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ֫֨;->᩸:Ll/֨֫֨;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 193
    iget-object v0, p0, Ll/ۘ֫֨;->᩸:Ll/֨֫֨;

    iget-object v1, v0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v2, v0, Ll/֨֫֨;->ۜۧ:I

    new-instance v3, Ll/ۚ֫֨;

    invoke-direct {v3, v0}, Ll/ۚ֫֨;-><init>(Ll/֨֫֨;)V

    invoke-virtual {v1, v2, v3}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\""

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ᩴۗۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
