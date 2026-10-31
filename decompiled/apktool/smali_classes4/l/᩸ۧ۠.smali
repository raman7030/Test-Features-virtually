.class public final enum Ll/᩸ۧ۠;
.super Ljava/lang/Enum;
.source "A451"


# static fields
.field public static final enum ۗ:Ll/᩸ۧ۠;

.field public static final enum ۙ:Ll/᩸ۧ۠;

.field public static final enum ۫:Ll/᩸ۧ۠;

.field public static final enum ۬:Ll/᩸ۧ۠;

.field public static final synthetic ᩶:[Ll/᩸ۧ۠;


# instance fields
.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 721
    new-instance v0, Ll/᩸ۧ۠;

    const-string v1, "arg.length.mismatch"

    const-string v2, "infer.arg.length.mismatch"

    const-string v3, "ARITY_MISMATCH"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Ll/᩸ۧ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/᩸ۧ۠;->ۗ:Ll/᩸ۧ۠;

    .line 725
    new-instance v0, Ll/᩸ۧ۠;

    const-string v1, "no.conforming.assignment.exists"

    const-string v2, "infer.no.conforming.assignment.exists"

    const-string v3, "ARG_MISMATCH"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Ll/᩸ۧ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/᩸ۧ۠;->ۙ:Ll/᩸ۧ۠;

    .line 729
    new-instance v0, Ll/᩸ۧ۠;

    const-string v1, "varargs.argument.mismatch"

    const-string v2, "infer.varargs.argument.mismatch"

    const-string v3, "VARARG_MISMATCH"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Ll/᩸ۧ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/᩸ۧ۠;->۫:Ll/᩸ۧ۠;

    .line 733
    new-instance v0, Ll/᩸ۧ۠;

    const/4 v1, 0x3

    const-string v2, "inaccessible.varargs.type"

    const-string v3, "INACCESSIBLE_VARARGS"

    invoke-direct {v0, v3, v1, v2, v2}, Ll/᩸ۧ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/᩸ۧ۠;->۬:Ll/᩸ۧ۠;

    .line 717
    invoke-static {}, Ll/᩸ۧ۠;->ۧ()[Ll/᩸ۧ۠;

    move-result-object v0

    sput-object v0, Ll/᩸ۧ۠;->᩶:[Ll/᩸ۧ۠;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 738
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 739
    iput-object p3, p0, Ll/᩸ۧ۠;->᩸:Ljava/lang/String;

    .line 740
    iput-object p4, p0, Ll/᩸ۧ۠;->᩹:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩸ۧ۠;
    .locals 1

    .line 717
    const-class v0, Ll/᩸ۧ۠;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩸ۧ۠;

    return-object p0
.end method

.method public static values()[Ll/᩸ۧ۠;
    .locals 1

    .line 717
    sget-object v0, Ll/᩸ۧ۠;->᩶:[Ll/᩸ۧ۠;

    invoke-virtual {v0}, [Ll/᩸ۧ۠;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩸ۧ۠;

    return-object v0
.end method

.method public static synthetic ۧ()[Ll/᩸ۧ۠;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/᩸ۧ۠;

    .line 717
    sget-object v1, Ll/᩸ۧ۠;->ۗ:Ll/᩸ۧ۠;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸ۧ۠;->ۙ:Ll/᩸ۧ۠;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸ۧ۠;->۫:Ll/᩸ۧ۠;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸ۧ۠;->۬:Ll/᩸ۧ۠;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫()Ljava/lang/String;
    .locals 5

    .line 744
    iget-object v0, p0, Ll/᩸ۧ۠;->᩸:Ljava/lang/String;

    iget-object v1, p0, Ll/᩸ۧ۠;->᩹:Ljava/lang/String;

    const-string v2, "|"

    const-string v3, ")"

    const-string v4, "([a-z]*\\.)*("

    .line 0
    invoke-static {v4, v0, v2, v1, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
