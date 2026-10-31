.class public final Ll/֡ۗ᩻;
.super Ljava/lang/Object;
.source "R77X"


# instance fields
.field public ֫:I

.field public final ۜ:Z

.field public ۢ:Z

.field public ۧ:[B

.field public final ܳ:Ljava/lang/String;

.field public ܽ:Z

.field public final ܿ:Ljava/util/LinkedHashSet;

.field public ᩳ:Ll/ۤ᩺᩻;

.field public final ᩷:Ljava/util/LinkedHashMap;

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IIZ)V
    .locals 1

    .line 1110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1099
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/֡ۗ᩻;->᩷:Ljava/util/LinkedHashMap;

    .line 1100
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/֡ۗ᩻;->ܿ:Ljava/util/LinkedHashSet;

    .line 1111
    iput-object p1, p0, Ll/֡ۗ᩻;->ܳ:Ljava/lang/String;

    .line 1112
    iput p2, p0, Ll/֡ۗ᩻;->᩻:I

    .line 1113
    iput-boolean p4, p0, Ll/֡ۗ᩻;->ۜ:Z

    .line 1114
    iput p3, p0, Ll/֡ۗ᩻;->֫:I

    return-void
.end method

.method public static ֫(IILjava/lang/String;)Ll/֡ۗ᩻;
    .locals 2

    .line 1122
    new-instance v0, Ll/֡ۗ᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p0, p1, v1}, Ll/֡ۗ᩻;-><init>(Ljava/lang/String;IIZ)V

    .line 1123
    invoke-static {p1}, Ll/ۤ᩺᩻;->ۧ(I)Ll/ۤ᩺᩻;

    move-result-object p0

    iput-object p0, v0, Ll/֡ۗ᩻;->ᩳ:Ll/ۤ᩺᩻;

    return-object v0
.end method

.method public static ֫(ILjava/lang/String;)Ll/֡ۗ᩻;
    .locals 3

    .line 1118
    new-instance v0, Ll/֡ۗ᩻;

    const/4 v1, 0x1

    const/4 v2, -0x1

    invoke-direct {v0, p1, p0, v2, v1}, Ll/֡ۗ᩻;-><init>(Ljava/lang/String;IIZ)V

    return-object v0
.end method
