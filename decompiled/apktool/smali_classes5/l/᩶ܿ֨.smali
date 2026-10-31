.class public final synthetic Ll/᩶ܿ֨;
.super Ljava/lang/Object;
.source "L7ER"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/۬ܿ֨;


# direct methods
.method public synthetic constructor <init>(Ll/۬ܿ֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ܿ֨;->᩸:Ll/۬ܿ֨;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 6

    .line 345
    iget-object v0, p0, Ll/᩶ܿ֨;->᩸:Ll/۬ܿ֨;

    iget v1, v0, Ll/۬ܿ֨;->֡ۧ:I

    .line 346
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, v0, Ll/۬ܿ֨;->ۖۧ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, v0, Ll/۬ܿ֨;->ܺۧ:[I

    invoke-static {v3}, Ll/ᩴۗۚ;->֫([I)Ljava/lang/String;

    move-result-object v3

    iget-object v0, v0, Ll/۬ܿ֨;->ۚۧ:[I

    invoke-static {v0}, Ll/ᩴۗۚ;->֫([I)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v2, v4, v1

    const/4 v1, 0x2

    aput-object v3, v4, v1

    const/4 v1, 0x3

    aput-object v0, v4, v1

    const-string v0, " full_frame=%d offset=%d numloc=%s  numstack=%s"

    .line 19
    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
